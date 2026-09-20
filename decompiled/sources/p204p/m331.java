package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class m331 {

    /* JADX INFO: renamed from: a */
    public final List f139520a;

    public m331(List list) {
        this.f139520a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m331) && wj50.m88271j(this.f139520a, ((m331) obj).f139520a);
    }

    public final int hashCode() {
        return this.f139520a.hashCode();
    }
}
