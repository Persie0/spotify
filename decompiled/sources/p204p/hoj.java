package p204p;

import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class hoj extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93549a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ContentPickerFragment f93550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hoj(ContentPickerFragment contentPickerFragment, int i) {
        super(2);
        this.f93549a = i;
        this.f93550b = contentPickerFragment;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (this.f93549a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                String str6 = (String) obj2;
                ContentPickerFragment contentPickerFragment = this.f93550b;
                pq91 pq91VarM3100k1 = contentPickerFragment.m3100k1();
                hiy0 hiy0Var = (hiy0) contentPickerFragment.m3102m1().f5622b.mo33098e();
                if (hiy0Var == null || (str = hiy0Var.f91901a) == null) {
                    str = "";
                }
                ((qq91) pq91VarM3100k1).m73509h(iIntValue, str, str6);
                break;
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                String str7 = (String) obj2;
                ContentPickerFragment contentPickerFragment2 = this.f93550b;
                pq91 pq91VarM3100k2 = contentPickerFragment2.m3100k1();
                hiy0 hiy0Var2 = (hiy0) contentPickerFragment2.m3102m1().f5622b.mo33098e();
                if (hiy0Var2 == null || (str2 = hiy0Var2.f91901a) == null) {
                    str2 = "";
                }
                ((qq91) pq91VarM3100k2).m73509h(iIntValue2, str2, str7);
                break;
            case 2:
                myn0 myn0Var = (myn0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ContentPickerFragment contentPickerFragment3 = this.f93550b;
                pq91 pq91VarM3100k3 = contentPickerFragment3.m3100k1();
                hiy0 hiy0Var3 = (hiy0) contentPickerFragment3.m3102m1().f5622b.mo33098e();
                if (hiy0Var3 == null || (str3 = hiy0Var3.f91901a) == null) {
                    str3 = "";
                }
                ((qq91) pq91VarM3100k3).m73510i(str3, iIntValue3, myn0Var);
                break;
            case 3:
                ((Number) obj2).intValue();
                this.f93550b.m3102m1().m15621f(new znj((jyn0) obj, true));
                break;
            case 4:
                int iIntValue4 = ((Number) obj).intValue();
                String str8 = (String) obj2;
                ContentPickerFragment contentPickerFragment4 = this.f93550b;
                pq91 pq91VarM3100k4 = contentPickerFragment4.m3100k1();
                hiy0 hiy0Var4 = (hiy0) contentPickerFragment4.m3102m1().f5622b.mo33098e();
                if (hiy0Var4 == null || (str4 = hiy0Var4.f91901a) == null) {
                    str4 = "";
                }
                ((qq91) pq91VarM3100k4).m73509h(iIntValue4, str4, str8);
                break;
            default:
                jyn0 jyn0Var = (jyn0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ContentPickerFragment contentPickerFragment5 = this.f93550b;
                pq91 pq91VarM3100k5 = contentPickerFragment5.m3100k1();
                hiy0 hiy0Var5 = (hiy0) contentPickerFragment5.m3102m1().f5622b.mo33098e();
                if (hiy0Var5 == null || (str5 = hiy0Var5.f91901a) == null) {
                    str5 = "";
                }
                ((qq91) pq91VarM3100k5).m73510i(str5, iIntValue5, jyn0Var);
                break;
        }
        return w2a1.f247311a;
    }
}
