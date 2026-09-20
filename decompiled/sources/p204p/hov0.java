package p204p;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class hov0 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public static final hov0 f93641h = new hov0(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((Member) obj).isSynthetic());
    }
}
