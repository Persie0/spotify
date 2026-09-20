package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s330 implements u330 {

    /* JADX INFO: renamed from: a */
    public final String f205162a;

    public s330(String str) {
        this.f205162a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s330) && wj50.m88271j(this.f205162a, ((s330) obj).f205162a);
    }

    public final int hashCode() {
        return this.f205162a.hashCode();
    }
}
