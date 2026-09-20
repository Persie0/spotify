package p204p;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zj30 {

    /* JADX INFO: renamed from: a */
    public final String f283344a;

    /* JADX INFO: renamed from: b */
    public final fk30 f283345b;

    /* JADX INFO: renamed from: c */
    public final xf40 f283346c;

    public zj30(String str, fk30 fk30Var, Map map) {
        str.getClass();
        this.f283344a = str;
        fk30Var.getClass();
        this.f283345b = fk30Var;
        this.f283346c = xf40.m90451c(map);
    }

    /* JADX INFO: renamed from: a */
    public static zj30 m96225a(String str, fk30 fk30Var) {
        return new zj30(str, fk30Var, btv0.f30940g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj30)) {
            return false;
        }
        zj30 zj30Var = (zj30) obj;
        return Objects.equals(this.f283344a, zj30Var.f283344a) && Objects.equals(this.f283345b, zj30Var.f283345b) && Objects.equals(this.f283346c, zj30Var.f283346c);
    }

    public final int hashCode() {
        return Objects.hash(this.f283344a, this.f283345b, this.f283346c);
    }
}
