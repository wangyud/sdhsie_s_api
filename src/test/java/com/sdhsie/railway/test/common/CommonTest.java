package com.sdhsie.railway.test.common;

import com.sdhsie.railway.common.utils.DateUtils;
import com.sdhsie.railway.common.utils.FileUtils;
import com.sdhsie.railway.common.utils.RandomUtils;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by chenkaihua on 15-8-23.
 */
public class CommonTest {


    @Test
    public void testSimpleDateFromat() {
        String timeFromatedString = DateUtils.getCurrentTimeFromatedString();
        assertNotNull(timeFromatedString);
        System.out.println(timeFromatedString);
    }

    @Test
    public void testRandomString() {
        String randomString = RandomUtils.randomString();
        assertNotNull(randomString);
        System.out.println(randomString);
    }


    @Test
    public void testFileUtls() {
        String fileType = FileUtils.getFileType("sfdsafasfimage");
        System.out.println(fileType);
    }

}
