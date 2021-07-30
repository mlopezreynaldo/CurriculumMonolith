package com.darkblue97.curriculummonolith.domain;

import com.darkblue97.curriculummonolith.utils.LanguageEnum;
import com.darkblue97.curriculummonolith.utils.MasteringLevel;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Skills {

    @Id
    private UUID id;
    private String skillName;
    private String description;
    private MasteringLevel masteringLevel;
    private LanguageEnum languageCode;

    public Skills(UUID id, String skillName, String description, MasteringLevel masteringLevel) {
        this.id = id;
        this.skillName = skillName;
        this.description = description;
        this.masteringLevel = masteringLevel;
    }
}
