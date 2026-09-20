package p204p;

import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ron0 {

    /* JADX INFO: renamed from: a */
    public final luk f201305a;

    /* JADX INFO: renamed from: b */
    public final sr6 f201306b;

    public ron0(sr6 sr6Var, luk lukVar) {
        this.f201305a = lukVar;
        this.f201306b = sr6Var;
    }

    /* JADX INFO: renamed from: a */
    public static Object m76073a(ron0 ron0Var, List list, String str, ibk ibkVar) {
        return x0h1.m89557A(ron0Var.f201305a, new zu8(ron0Var, list, str, false, (fbk) null), ibkVar);
    }

    /* JADX INFO: renamed from: b */
    public final Single m76074b(String str, List list, boolean z) {
        return vjf1.m85770t(this.f201305a, new ml1(this, list, str, z, (fbk) null, 15));
    }

    /* JADX INFO: renamed from: c */
    public final fiz m76075c() {
        return cyf1.m34374j(new vgk0(this.f201306b.m79040P((Empty) Empty.m1934o().build()), 9), this.f201305a);
    }
}
