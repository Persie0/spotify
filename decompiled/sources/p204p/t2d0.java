package p204p;

import io.ably.lib.rest.Auth;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class t2d0 implements o2d0 {

    /* JADX INFO: renamed from: a */
    public o2d0 f216491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f216492b;

    public t2d0(List list) {
        this.f216492b = list;
    }

    @Override // p204p.o2d0
    public final String description() {
        StringBuilder sb = new StringBuilder(1024);
        String str = "";
        for (o2d0 o2d0Var : this.f216492b) {
            String str2 = wj50.m88271j(this.f216491a, o2d0Var) ? Auth.WILDCARD_CLIENTID : "";
            sb.append(str);
            sb.append(str2);
            sb.append(o2d0Var.description());
            sb.append(str2);
            str = " OR ";
        }
        return sb.toString();
    }

    @Override // p204p.o2d0
    public final boolean match(Object obj) {
        this.f216491a = null;
        for (o2d0 o2d0Var : this.f216492b) {
            if (o2d0Var.match(obj)) {
                this.f216491a = o2d0Var;
                return true;
            }
        }
        return false;
    }
}
