package p204p;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class y8t {

    /* JADX INFO: renamed from: a */
    public final ufd0 f270373a;

    /* JADX INFO: renamed from: b */
    public final boolean f270374b;

    /* JADX INFO: renamed from: c */
    public final boolean f270375c;

    /* JADX INFO: renamed from: d */
    public final long f270376d;

    /* JADX INFO: renamed from: e */
    public final int f270377e;

    /* JADX INFO: renamed from: f */
    public final nrt f270378f;

    /* JADX INFO: renamed from: g */
    public final kxq0 f270379g;

    /* JADX INFO: renamed from: h */
    public final jxq0 f270380h;

    /* JADX INFO: renamed from: i */
    public final pf40 f270381i;

    /* JADX INFO: renamed from: j */
    public long f270382j;

    public y8t(x8t x8tVar) {
        boolean z = x8tVar.f259218a;
        jxq0 jxq0Var = (jxq0) x8tVar.f259224g;
        c95.m31856v((z && x8tVar.f259220c) ? false : true, "Audio and video cannot both be removed");
        if (m93124d((ufd0) x8tVar.f259222e)) {
            c95.m31843i(x8tVar.f259219b != -9223372036854775807L);
            c95.m31843i(!x8tVar.f259218a);
            c95.m31843i(((nrt) x8tVar.f259223f).f157604a.isEmpty());
            c95.m31843i(jxq0Var == jxq0.f117181R0);
        }
        jxq0Var.getClass();
        kxq0 kxq0Var = kxq0.f127556Q0;
        this.f270373a = (ufd0) x8tVar.f259222e;
        this.f270374b = x8tVar.f259218a;
        this.f270375c = x8tVar.f259220c;
        this.f270376d = x8tVar.f259219b;
        this.f270377e = x8tVar.f259221d;
        this.f270378f = (nrt) x8tVar.f259223f;
        this.f270379g = kxq0Var;
        this.f270380h = jxq0Var;
        this.f270381i = (pf40) x8tVar.f259225h;
        this.f270382j = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m93124d(ufd0 ufd0Var) {
        return Objects.equals(ufd0Var.f229762a, "androidx-media3-GapMediaItem");
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m93125e(ufd0 ufd0Var) throws JSONException {
        String string;
        int iLastIndexOf;
        JSONObject jSONObject = new JSONObject();
        ofd0 ofd0Var = ufd0Var.f229763b;
        ifd0 ifd0Var = ufd0Var.f229766e;
        jSONObject.put("extension", (ofd0Var == null || (iLastIndexOf = (string = ofd0Var.f164727a.toString()).lastIndexOf(46)) <= 0 || iLastIndexOf >= string.length() + (-1)) ? "UNSET" : string.substring(iLastIndexOf + 1));
        if (ifd0Var.equals(hfd0.f90681i)) {
            jSONObject.put("clipping", "UNSET");
            return jSONObject;
        }
        long j = ifd0Var.f90692c;
        String strValueOf = j == Long.MIN_VALUE ? "END_OF_SOURCE" : String.valueOf(j);
        jSONObject.put("clippingStartMs", ifd0Var.f90690a);
        jSONObject.put("clippingEndMs", strValueOf);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final x8t m93126a() {
        x8t x8tVar = new x8t();
        x8tVar.f259222e = this.f270373a;
        x8tVar.f259218a = this.f270374b;
        x8tVar.f259220c = this.f270375c;
        x8tVar.f259219b = this.f270376d;
        x8tVar.f259221d = this.f270377e;
        x8tVar.f259223f = this.f270378f;
        x8tVar.f259224g = this.f270380h;
        x8tVar.f259225h = this.f270381i;
        return x8tVar;
    }

    /* JADX INFO: renamed from: b */
    public final long m93127b(long j) {
        long jMo40331j;
        boolean z = this.f270374b;
        nrt nrtVar = this.f270378f;
        if (z) {
            jMo40331j = -9223372036854775807L;
        } else {
            kf40 kf40VarM69798r = nrtVar.f157604a.listIterator(0);
            jMo40331j = j;
            while (kf40VarM69798r.hasNext()) {
                jMo40331j = ((t27) kf40VarM69798r.next()).mo40331j(jMo40331j);
            }
        }
        if (this.f270375c) {
            j = -9223372036854775807L;
        } else {
            kf40 kf40VarM69798r2 = nrtVar.f157605b.listIterator(0);
            while (kf40VarM69798r2.hasNext()) {
                ((cnt) kf40VarM69798r2.next()).getClass();
            }
        }
        return Math.max(jMo40331j, j);
    }

    /* JADX INFO: renamed from: c */
    public final long m93128c() {
        long j = this.f270376d;
        c95.m31855u(j != -9223372036854775807L);
        if (this.f270382j == -9223372036854775807L) {
            ifd0 ifd0Var = this.f270373a.f229766e;
            boolean zEquals = ifd0Var.equals(hfd0.f90681i);
            long j2 = ifd0Var.f90691b;
            long j3 = ifd0Var.f90693d;
            if (!zEquals) {
                c95.m31843i(!ifd0Var.f90695f);
                if (j3 == Long.MIN_VALUE) {
                    j -= j2;
                } else {
                    c95.m31843i(j3 <= j);
                    j = j3 - j2;
                }
            }
            this.f270382j = j;
            kxq0 kxq0Var = kxq0.f127556Q0;
            kxq0 kxq0Var2 = this.f270379g;
            if (kxq0Var2 != kxq0Var) {
                this.f270382j = p271.m68914q(kxq0Var2, j);
            } else {
                this.f270382j = m93127b(j);
            }
        }
        return this.f270382j;
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m93129f() {
        long j = this.f270376d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mediaItem", m93125e(this.f270373a));
            jSONObject.put("effects", this.f270378f.m65489a());
            jSONObject.put("removeAudio", this.f270374b);
            jSONObject.put("removeVideo", this.f270375c);
            jSONObject.put("durationUs", j);
            jSONObject.put("presentationDuration", j != -9223372036854775807L ? Long.valueOf(m93128c()) : "N/A");
            return jSONObject;
        } catch (JSONException e) {
            yif1.m93821x0("JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return m93129f().toString();
    }
}
