package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i000 implements h000 {

    /* JADX INFO: renamed from: a */
    public final String f97084a;

    /* JADX INFO: renamed from: b */
    public final float f97085b;

    public i000(String str, float f) {
        this.f97084a = str;
        this.f97085b = f;
    }

    @Override // p204p.h000
    /* JADX INFO: renamed from: a */
    public final float mo46232a() {
        return this.f97085b;
    }

    @Override // p204p.h000
    /* JADX INFO: renamed from: b */
    public final String mo46233b() {
        return this.f97084a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i000)) {
            return false;
        }
        i000 i000Var = (i000) obj;
        return wj50.m88271j(this.f97084a, i000Var.f97084a) && this.f97085b == i000Var.f97085b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f97085b) + (this.f97084a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontVariation.Setting(axisName='");
        sb.append(this.f97084a);
        sb.append("', value=");
        return ms2.m62684i(sb, this.f97085b, ')');
    }
}
