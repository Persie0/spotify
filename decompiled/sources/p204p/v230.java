package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class v230 extends e330 {

    /* JADX INFO: renamed from: e */
    public final String f236532e;

    /* JADX INFO: renamed from: f */
    public final Exception f236533f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v230(Exception exc, String str) {
        super("errored");
        LinkedHashMap linkedHashMap = qm0.f189980b;
        this.f236532e = str;
        this.f236533f = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v230)) {
            return false;
        }
        v230 v230Var = (v230) obj;
        return wj50.m88271j(this.f236532e, v230Var.f236532e) && wj50.m88271j(this.f236533f, v230Var.f236533f);
    }

    public final int hashCode() {
        int iHashCode = this.f236532e.hashCode() * 31;
        Exception exc = this.f236533f;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }
}
