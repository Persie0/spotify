package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ee8 extends te8 {

    /* JADX INFO: renamed from: a */
    public final String f58704a;

    /* JADX INFO: renamed from: b */
    public final UUID f58705b;

    /* JADX INFO: renamed from: c */
    public final re8 f58706c;

    /* JADX INFO: renamed from: d */
    public final hg8 f58707d;

    public ee8(String str, UUID uuid, re8 re8Var, hg8 hg8Var) {
        this.f58704a = str;
        this.f58705b = uuid;
        this.f58706c = re8Var;
        this.f58707d = hg8Var;
    }

    @Override // p204p.te8
    /* JADX INFO: renamed from: a */
    public final String mo32497a() {
        return this.f58704a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee8)) {
            return false;
        }
        ee8 ee8Var = (ee8) obj;
        return wj50.m88271j(this.f58704a, ee8Var.f58704a) && wj50.m88271j(this.f58705b, ee8Var.f58705b) && wj50.m88271j(this.f58706c, ee8Var.f58706c) && this.f58707d == ee8Var.f58707d;
    }

    public final int hashCode() {
        return this.f58707d.hashCode() + ((this.f58706c.hashCode() + ((this.f58705b.hashCode() + (this.f58704a.hashCode() * 31)) * 31)) * 31);
    }
}
