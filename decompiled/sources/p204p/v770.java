package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class v770 extends h870 {

    /* JADX INFO: renamed from: a */
    public final String f238084a;

    /* JADX INFO: renamed from: b */
    public final String f238085b;

    public v770(String str, String str2) {
        this.f238084a = str;
        this.f238085b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v770)) {
            return false;
        }
        v770 v770Var = (v770) obj;
        return wj50.m88271j(this.f238084a, v770Var.f238084a) && wj50.m88271j(this.f238085b, v770Var.f238085b);
    }

    public final int hashCode() {
        return this.f238085b.hashCode() + (this.f238084a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.f238084a);
        sb.append('.');
        return dq60.m36617q(sb, this.f238085b, ')');
    }
}
