package io.seata.sample;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.seata.common.util.StringUtils;
import io.seata.core.context.RootContext;
import org.springframework.context.annotation.Configuration;


@Deprecated
public class XidFeignClientInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        // seata 传递XID
//        String xid = RootContext.getXID();
//        if (StringUtils.isNotEmpty(xid)) {
//            template.header(RootContext.KEY_XID, xid);
//        }
    }
}
