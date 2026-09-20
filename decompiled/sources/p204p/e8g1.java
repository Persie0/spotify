package p204p;

import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class e8g1 extends rv1 {

    /* JADX INFO: renamed from: a */
    public final String f57195a;

    /* JADX INFO: renamed from: b */
    public final String f57196b;

    /* JADX INFO: renamed from: c */
    public final qv1 f57197c;

    /* JADX INFO: renamed from: d */
    public final fhv0 f57198d;

    /* JADX INFO: renamed from: e */
    public final Optional f57199e;

    /* JADX INFO: renamed from: f */
    public final Optional f57200f;

    public e8g1(String str, String str2, qv1 qv1Var, fhv0 fhv0Var, Optional optional, Optional optional2) {
        this.f57195a = str;
        this.f57196b = str2;
        this.f57197c = qv1Var;
        this.f57198d = fhv0Var;
        this.f57199e = optional;
        this.f57200f = optional2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rv1) {
            e8g1 e8g1Var = (e8g1) ((rv1) obj);
            if (this.f57195a.equals(e8g1Var.f57195a) && this.f57196b.equals(e8g1Var.f57196b) && this.f57197c.equals(e8g1Var.f57197c) && this.f57198d.equals(e8g1Var.f57198d) && this.f57199e.equals(e8g1Var.f57199e) && this.f57200f.equals(e8g1Var.f57200f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f57195a.hashCode() ^ 1000003) * 1000003) ^ this.f57196b.hashCode()) * 1000003) ^ this.f57197c.hashCode()) * 1000003) ^ this.f57198d.hashCode()) * 1000003) ^ this.f57199e.hashCode()) * 1000003) ^ this.f57200f.hashCode();
    }

    public final String toString() {
        String string = this.f57197c.toString();
        String string2 = this.f57198d.toString();
        String strValueOf = String.valueOf(this.f57199e);
        String strValueOf2 = String.valueOf(this.f57200f);
        StringBuilder sb = new StringBuilder("AddonMeetingInfo{meetingCode=");
        sb.append(this.f57195a);
        sb.append(", meetingUrl=");
        klh.m56844p(sb, this.f57196b, ", meetingStatus=", string, ", recordingInfo=");
        klh.m56844p(sb, string2, ", initialCoWatchingState=", strValueOf, ", initialCoDoingState=");
        return dq60.m36616p(strValueOf2, "}", sb);
    }
}
