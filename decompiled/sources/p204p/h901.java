package p204p;

import com.spotify.music.R;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class h901 {

    /* JADX INFO: renamed from: a */
    public final f901 f88848a;

    /* JADX INFO: renamed from: b */
    public final tdu f88849b;

    /* JADX INFO: renamed from: c */
    public final Object f88850c;

    /* JADX INFO: renamed from: d */
    public final Object f88851d;

    /* JADX INFO: renamed from: e */
    public final Map f88852e;

    /* JADX INFO: renamed from: f */
    public final fn41 f88853f;

    /* JADX INFO: renamed from: g */
    public final wg61 f88854g;

    /* JADX INFO: renamed from: h */
    public final wg61 f88855h;

    public h901(f901 f901Var, tdu tduVar, Serializable serializable, Map map, int i) {
        this(f901Var, (i & 2) != 0 ? new pdu(Integer.valueOf(R.string.settings_disabled_reason_loading), null) : tduVar, (i & 4) != 0 ? null : serializable, (Object) null, (i & 16) != 0 ? nau.f152117a : map);
    }

    /* JADX INFO: renamed from: a */
    public final String m46858a(xq00 xq00Var) {
        return jcg1.m52998r(this.f88848a.f67141b.f81563c, null, xq00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h901)) {
            return false;
        }
        h901 h901Var = (h901) obj;
        return wj50.m88271j(this.f88848a, h901Var.f88848a) && wj50.m88271j(this.f88849b, h901Var.f88849b) && wj50.m88271j(this.f88850c, h901Var.f88850c) && wj50.m88271j(this.f88851d, h901Var.f88851d) && wj50.m88271j(this.f88852e, h901Var.f88852e);
    }

    public final int hashCode() {
        int iHashCode = (this.f88849b.hashCode() + (this.f88848a.hashCode() * 31)) * 31;
        Object obj = this.f88850c;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f88851d;
        return this.f88852e.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public h901(f901 f901Var, tdu tduVar, Object obj, Object obj2, Map map) {
        this.f88848a = f901Var;
        this.f88849b = tduVar;
        this.f88850c = obj;
        this.f88851d = obj2;
        this.f88852e = map;
        this.f88853f = f901Var.f67142c;
        this.f88854g = new wg61(new g901(this, 0));
        this.f88855h = new wg61(new g901(this, 1));
    }
}
