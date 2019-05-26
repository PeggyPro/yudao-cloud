package cn.iocoder.mall.admin.dataobject;

import cn.iocoder.common.framework.dataobject.BaseDO;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 短信 client log
 *
 * @author Sin
 * @time 2019/5/25 12:36 PM
 */
@Data
@Accessors(chain = true)
public class SmsClientLog extends BaseDO {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 短信模板
     */
    private Integer templateId;
    /**
     * 短信
     */
    private String template;
    /**
     * 发送信息
     */
    private String message;
}