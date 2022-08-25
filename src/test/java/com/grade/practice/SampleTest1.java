package com.grade.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wizGradeSchoolapp.generic.BaseClass;

public class SampleTest1 extends BaseClass {
@Test(retryAnalyzer = com.wizGradeSchoolapp.generic.ReTryImpclass.class)
public void amazontest() {
Assert.assertEquals("A", "B");
}
}
