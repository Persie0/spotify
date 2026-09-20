package p204p;

import com.ravelin.core.model.Events;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.model.Payload;
import com.ravelin.core.model.SharedPackages;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m24212d2 = {"Lp/t1f1;", "", "", "token", "Lcom/ravelin/core/model/Events;", "objectAsJSon", "Lp/x8b;", "Lp/w2a1;", "b", "(Ljava/lang/String;Lcom/ravelin/core/model/Events;)Lp/x8b;", "Lcom/ravelin/core/model/Payload;", "source", "d", "(Ljava/lang/String;Lcom/ravelin/core/model/Payload;Ljava/lang/String;)Lp/x8b;", "Lcom/ravelin/core/model/MobileReportRequest;", "mobileReportRequest", "a", "(Ljava/lang/String;Lcom/ravelin/core/model/MobileReportRequest;)Lp/x8b;", "Lcom/ravelin/core/model/SharedPackages;", "sharedPackages", "c", "(Ljava/lang/String;Lcom/ravelin/core/model/SharedPackages;)Lp/x8b;", "core_release"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public interface t1f1 {
    @j3m0("mobilereport")
    /* JADX INFO: renamed from: a */
    x8b<w2a1> m79872a(@xe20("Authorization") String token, @h4a MobileReportRequest mobileReportRequest);

    @j3m0("click")
    /* JADX INFO: renamed from: b */
    x8b<w2a1> m79873b(@xe20("Authorization") String token, @h4a Events objectAsJSon);

    @j3m0("sdk/sharedpackages")
    /* JADX INFO: renamed from: c */
    x8b<w2a1> m79874c(@xe20("Authorization") String token, @h4a SharedPackages sharedPackages);

    @j3m0("fingerprint")
    /* JADX INFO: renamed from: d */
    x8b<w2a1> m79875d(@xe20("Authorization") String token, @h4a Payload objectAsJSon, @hit0("source") String source);
}
