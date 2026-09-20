package p204p;

import com.spotify.searchview.proto.Entity;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class u79 {

    /* JADX INFO: renamed from: a */
    public final List f227534a;

    /* JADX INFO: renamed from: b */
    public final h50 f227535b;

    /* JADX INFO: renamed from: c */
    public final String f227536c;

    public u79(List list, h50 h50Var, String str) {
        this.f227534a = list;
        this.f227535b = h50Var;
        this.f227536c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u79)) {
            return false;
        }
        u79 u79Var = (u79) obj;
        return wj50.m88271j(this.f227534a, u79Var.f227534a) && wj50.m88271j(this.f227535b, u79Var.f227535b) && wj50.m88271j(this.f227536c, u79Var.f227536c);
    }

    public final int hashCode() {
        return this.f227536c.hashCode() + ((this.f227535b.hashCode() + (this.f227534a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ u79(List list, h50 h50Var, int i) {
        this((i & 1) != 0 ? lau.f131415a : list, (i & 2) != 0 ? new h50(null, null, null, null, null, 0.0f, null, null, null, 0, null, Entity.SERP_METADATA_FIELD_NUMBER) : h50Var, "");
    }
}
