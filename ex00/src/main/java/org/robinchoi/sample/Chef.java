package org.robinchoi.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

// Component : spring 관리 대상임을 표시. root-context에서 빈 등록
// Data :setter, 생성자, toString() 자동 생
@Component
@Data
public class Chef {

}
