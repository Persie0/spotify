package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class sq70 {

    /* JADX INFO: renamed from: a */
    public final Object f213033a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f213034b = new LinkedHashMap();

    public sq70(Object obj) {
        this.f213033a = obj;
    }

    /* JADX INFO: renamed from: a */
    public Object mo78940a() {
        return this.f213033a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return getClass().equals(obj != null ? obj.getClass() : null) && wj50.m88271j(mo78940a(), ((sq70) obj).mo78940a());
    }

    public final int hashCode() {
        return mo78940a().hashCode();
    }
}
