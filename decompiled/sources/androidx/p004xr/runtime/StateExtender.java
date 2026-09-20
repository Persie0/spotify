package androidx.p004xr.runtime;

import java.util.List;
import kotlin.Metadata;
import p204p.etk;
import p204p.fbk;
import p204p.op60;
import p204p.w2a1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m24212d2 = {"Landroidx/xr/runtime/StateExtender;", "", "", "Lp/op60;", "runtimes", "Lp/w2a1;", "initialize", "(Ljava/util/List;)V", "Lp/etk;", "coreState", "extend", "(Lp/etk;Lp/fbk;)Ljava/lang/Object;", "close", "()V", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public interface StateExtender {
    void close();

    Object extend(etk etkVar, fbk<? super w2a1> fbkVar);

    void initialize(List<? extends op60> runtimes);
}
