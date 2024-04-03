package com.example.videofilm;

import lombok.*;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Video {
    private long id;
    private String title;
    private String url;


}
