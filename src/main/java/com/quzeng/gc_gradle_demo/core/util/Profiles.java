package com.quzeng.gc_gradle_demo.core.util;

import org.springframework.beans.factory.annotation.Value;

/**
 *@ClassName: Profiles
 *@program: finance
 *@description: 配置参数
 *@author: GC
 *@create: 2018-08-29 17:14
 */
public class Profiles {

    @Value("${FUYOU_INS_PRIVATE_KEY}")
    public String FUYOU_INS_PRIVATE_KEY;

    @Value("${FUYOU_INS_PUBLIC_KEY}")
    public String FUYOU_INS_PUBLIC_KEY;

    @Value("${FUYOU_FY_PUBLIC_KEY}")
    public String FUYOU_FY_PUBLIC_KEY;

    @Value("${fuyou_charset}")
    public String fuyou_charset;

    @Value("${fuyou_ins_cd}")
    public String fuyou_ins_cd;

    @Value("${fuyou_mchnt_cd}")
    public String fuyou_mchnt_cd;

    @Value("${fuyou_term_id}")
    public String fuyou_term_id;

    @Value("${fuyou_term_ip}")
    public String fuyou_term_ip;

    @Value("${fuyou_notify_url}")
    public String fuyou_notify_url;

    @Value("${fuyou_wxPre_url}")
    public String fuyou_wxPre_url;

    @Value("${fuyou_refund_url}")
    public String fuyou_refund_url;


}
