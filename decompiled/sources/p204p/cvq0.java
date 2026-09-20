package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class cvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final Map f42512a;

    public cvq0(Map map) {
        this.f42512a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvq0) && wj50.m88271j(this.f42512a, ((cvq0) obj).f42512a);
    }

    public final int hashCode() {
        return this.f42512a.hashCode();
    }
}
