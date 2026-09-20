package p204p;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class jov0 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public static final jov0 f114514h = new jov0(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((Member) obj).isSynthetic());
    }
}
