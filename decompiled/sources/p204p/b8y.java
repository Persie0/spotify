package p204p;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class b8y extends c8y {

    /* JADX INFO: renamed from: a */
    public final JSONObject f24692a;

    public b8y(JSONObject jSONObject) {
        this.f24692a = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8y) && wj50.m88271j(this.f24692a, ((b8y) obj).f24692a);
    }

    public final int hashCode() {
        return this.f24692a.hashCode();
    }
}
