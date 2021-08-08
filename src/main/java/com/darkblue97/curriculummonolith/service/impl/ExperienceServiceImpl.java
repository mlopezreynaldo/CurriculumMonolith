package com.darkblue97.curriculummonolith.service.impl;

import com.darkblue97.curriculummonolith.domain.dao.impl.JobsDAO;
import com.darkblue97.curriculummonolith.domain.dto.JobsDTO;
import com.darkblue97.curriculummonolith.exceptions.NotFoundException;
import com.darkblue97.curriculummonolith.service.ExperienceService;
import com.darkblue97.curriculummonolith.utils.LanguageEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Component
@Service
public class ExperienceServiceImpl implements ExperienceService {

    private final JobsDAO jobsDAO;

    public ExperienceServiceImpl(JobsDAO jobsDAO) {
        this.jobsDAO = jobsDAO;
    }

    @Override
    public List<JobsDTO> getAllExperience(LanguageEnum languageEnum) throws NotFoundException {
        return jobsDAO.getAll(languageEnum);
    }

    @Override
    public void putExperience(JobsDTO jobsDTO) {
        jobsDAO.save(jobsDTO);
    }

    @Override
    public void postExperience(JobsDTO jobsDTO) throws NotFoundException {
        jobsDAO.update(jobsDTO);
    }

    @Override
    public void deleteExperience(UUID id) throws NotFoundException {
        jobsDAO.delete(id);
    }
}
