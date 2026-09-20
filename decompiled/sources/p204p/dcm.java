package p204p;

import com.comscore.streaming.ContentDistributionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class dcm {

    /* JADX INFO: renamed from: a */
    public String f47576a;

    /* JADX INFO: renamed from: b */
    public int f47577b;

    /* JADX INFO: renamed from: c */
    public int f47578c;

    /* JADX INFO: renamed from: d */
    public float f47579d;

    /* JADX INFO: renamed from: a */
    public final dcm m35661a() {
        dcm dcmVar = new dcm();
        dcmVar.f47578c = Integer.MIN_VALUE;
        dcmVar.f47579d = Float.NaN;
        dcmVar.f47576a = this.f47576a;
        dcmVar.f47577b = this.f47577b;
        dcmVar.f47578c = this.f47578c;
        dcmVar.f47579d = this.f47579d;
        return dcmVar;
    }

    /* JADX INFO: renamed from: b */
    public final String m35662b() {
        return this.f47576a;
    }

    public final String toString() {
        String strM36617q = dq60.m36617q(new StringBuilder(), this.f47576a, ':');
        switch (this.f47577b) {
            case 900:
                StringBuilder sbM36620t = dq60.m36620t(strM36617q);
                sbM36620t.append(this.f47578c);
                return sbM36620t.toString();
            case ContentDistributionModel.TV_AND_ONLINE /* 901 */:
                StringBuilder sbM36620t2 = dq60.m36620t(strM36617q);
                sbM36620t2.append(this.f47579d);
                return sbM36620t2.toString();
            case ContentDistributionModel.EXCLUSIVELY_ONLINE /* 902 */:
                StringBuilder sbM36620t3 = dq60.m36620t(strM36617q);
                String str = "00000000" + Integer.toHexString(this.f47578c);
                sbM36620t3.append("#" + str.substring(str.length() - 8));
                return sbM36620t3.toString();
            case 903:
                return s571.m77250i(strM36617q, null);
            default:
                return s571.m77250i(strM36617q, "????");
        }
    }
}
