package p204p;

import io.ably.lib.rest.Auth;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s2d0 implements o2d0 {

    /* JADX INFO: renamed from: a */
    public o2d0 f204990a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f204991b;

    public s2d0(List list) {
        this.f204991b = list;
    }

    @Override // p204p.o2d0
    public final String description() {
        StringBuilder sb = new StringBuilder(1024);
        String str = "";
        for (o2d0 o2d0Var : this.f204991b) {
            String str2 = wj50.m88271j(this.f204990a, o2d0Var) ? Auth.WILDCARD_CLIENTID : "";
            sb.append(str);
            sb.append(str2);
            sb.append(o2d0Var.description());
            sb.append(str2);
            str = " AND ";
        }
        return sb.toString();
    }

    @Override // p204p.o2d0
    public final boolean match(Object obj) {
        this.f204990a = null;
        for (o2d0 o2d0Var : this.f204991b) {
            if (!o2d0Var.match(obj)) {
                this.f204990a = o2d0Var;
                return false;
            }
        }
        return true;
    }
}
