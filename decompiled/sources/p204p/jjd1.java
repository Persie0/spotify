package p204p;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class jjd1 implements a5h1, zns {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ jjd1 f113000a = new jjd1();

    /* JADX INFO: renamed from: b */
    public static final boolean m53534b(String str) {
        List listM44518y;
        List listM44518y2;
        int i;
        int i2;
        Pattern patternCompile = Pattern.compile("\\.");
        wl51.m88474X0(0);
        Matcher matcher = patternCompile.matcher("4.19.0.901");
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add("4.19.0.901".subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add("4.19.0.901".subSequence(iEnd, 10).toString());
            listM44518y = arrayList;
        } else {
            listM44518y = geg1.m44518y("4.19.0.901");
        }
        String[] strArr = (String[]) listM44518y.toArray(new String[0]);
        Pattern patternCompile2 = Pattern.compile("\\.");
        wl51.m88474X0(0);
        Matcher matcher2 = patternCompile2.matcher(str);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList2.add(str.subSequence(iEnd2, matcher2.start()).toString());
                iEnd2 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str.subSequence(iEnd2, str.length()).toString());
            listM44518y2 = arrayList2;
        } else {
            listM44518y2 = geg1.m44518y(str.toString());
        }
        String[] strArr2 = (String[]) listM44518y2.toArray(new String[0]);
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr2.length - 1 < i3 || (i2 = Integer.parseInt(strArr2[i3])) < (i = Integer.parseInt(strArr[i3]))) {
                return false;
            }
            if (i2 > i) {
                break;
            }
        }
        return true;
    }

    @Override // p204p.a5h1
    /* JADX INFO: renamed from: a */
    public ynd1 mo24801a(kuf1 kuf1Var) throws GeneralSecurityException {
        tbh1 tbh1Var = (tbh1) kuf1Var;
        return ynd1.m94246g("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", e8f1.m38101c(tbh1Var).m55799c(), q1h1.f184341f, e8f1.m38099a(tbh1Var.f218857d.f121207a), tbh1Var.f218860g);
    }

    @Override // p204p.zns
    /* JADX INFO: renamed from: c */
    public sa8 mo53535c(Context context, String str, yns ynsVar) {
        sa8 sa8Var = new sa8();
        int iMo30163a = ynsVar.mo30163a(context, str, true);
        sa8Var.f207155b = iMo30163a;
        if (iMo30163a != 0) {
            sa8Var.f207156c = 1;
            return sa8Var;
        }
        int iMo30164b = ynsVar.mo30164b(context, str);
        sa8Var.f207154a = iMo30164b;
        if (iMo30164b != 0) {
            sa8Var.f207156c = -1;
        }
        return sa8Var;
    }
}
