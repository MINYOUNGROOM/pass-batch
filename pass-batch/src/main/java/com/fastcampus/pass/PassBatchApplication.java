package com.fastcampus.pass;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@EnableBatchProcessing
@SpringBootApplication
public class PassBatchApplication {

//	@Autowired
//	private JobBuilder jobBuilder;
//
//	@Autowired
//	private StepBuilder stepBuilder;
//
//	// 생성자
//	public PassBatchApplication(JobBuilder jobBuilder, StepBuilder stepBuilder) {
//		this.jobBuilder = jobBuilder;
//		this.stepBuilder = stepBuilder;
//	}


//	@Bean
//	public Step passStep(StepBuilder stepBuilder){
//		return this.stepBuilder.getClass()
//				.tasklet((contribution, chunkContext) -> {
//			System.out.println("Execute Pass Step");
//			return RepeatStatus.FINISHED;
//		}).build();
//	}

	public static void main(String[] args) {
		SpringApplication.run(PassBatchApplication.class, args);
	}

}
