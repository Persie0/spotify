package p204p;

import android.os.Bundle;
import com.google.android.recaptcha.internal.zzagk;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class wed1 implements w111, u4h1, ach1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ wed1 f250515a = new wed1();

    /* JADX INFO: renamed from: b */
    public static e211 m87875b(eo01 eo01Var, List list) {
        dug1 gjiVar;
        ArrayList<String> stringArrayList = eo01Var.f61265b.getStringArrayList("watchfeed.share.destination_ids");
        if (stringArrayList != null) {
            wg61 wg61Var = fq01.f72032c;
            List listM67733s = osg1.m67733s();
            int iM31820L = c95.m31820L(i6f.m49804T(listM67733s, 10));
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (Object obj : listM67733s) {
                linkedHashMap.put(((fq01) obj).f72033a, obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = stringArrayList.iterator();
            while (it.hasNext()) {
                fq01 fq01Var = (fq01) linkedHashMap.get((String) it.next());
                if (fq01Var != null) {
                    arrayList.add(fq01Var);
                }
            }
            gjiVar = new gji(new ku01(new e2r(3, arrayList)));
        } else {
            gjiVar = fji.f70297b;
        }
        return new e211(list, 0, gjiVar, eo01Var.f61266c.f129799a);
    }

    @Override // p204p.u4h1
    /* JADX INFO: renamed from: a */
    public kuf1 mo24429a(ynd1 ynd1Var) throws GeneralSecurityException {
        x6h1 x6h1Var = c8f1.f35202a;
        String str = (String) ynd1Var.f274437a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
        }
        try {
            s9f1 s9f1Var = (s9f1) ynd1Var.f274438b;
            haf1 haf1Var = haf1.f89214b;
            int i = m9f1.f141300a;
            u8h1 u8h1VarM82575A = u8h1.m82575A(s9f1Var, haf1.f89214b);
            if (u8h1VarM82575A.m82582w() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            be41 be41Var = new be41(25);
            be41Var.f26281d = c8f1.m31780b(u8h1VarM82575A.m82583x().m72333w());
            be41Var.f26279b = c8f1.m31785g(u8h1VarM82575A.m82583x().m72330B());
            be41Var.f26280c = c8f1.m31784f(u8h1VarM82575A.m82583x().m72329A());
            be41Var.f26282e = c8f1.m31781c((t1h1) ynd1Var.f274440d);
            xah1 xah1VarM28879F = be41Var.m28879F();
            f7d1 f7d1Var = new f7d1(19);
            f7d1Var.f66659c = null;
            f7d1Var.f66660d = null;
            f7d1Var.f66658b = xah1VarM28879F;
            f7d1Var.f66659c = new ECPoint(new BigInteger(1, u8h1VarM82575A.m82584y().m77584y()), new BigInteger(1, u8h1VarM82575A.m82585z().m77584y()));
            f7d1Var.f66660d = (Integer) ynd1Var.f274441e;
            return f7d1Var.m40975o();
        } catch (zzagk | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) {
        lu01 lu01Var = eo01Var.f61264a;
        Bundle bundle = eo01Var.f61265b;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (lu01Var != null) {
            String string = bundle.getString("watchfeed.share.background_image_url");
            if (string != null) {
                String string2 = bundle.getString("watchfeed.share.share_format_id");
                String string3 = bundle.getString("watchfeed.share.pre_url_text");
                String string4 = bundle.getString("watchfeed.share.background_content_description");
                ro8 ro8Var = new ro8();
                ro8Var.f201160a = lu01Var.f136946a;
                if (string4 == null) {
                    string4 = "";
                }
                ro8Var.m76020a(new gcr0(string, string4));
                ro8Var.f201168i = new ao8(new fo8(string), str, objArr2 == true ? 1 : 0, 62);
                if (string2 != null) {
                    Set set = dd41.f47702f;
                    ro8Var.f201162c = new xr01(r46.m74726U(string2));
                }
                if (string3 != null) {
                    ro8Var.f201164e = string3;
                }
                return m87875b(eo01Var, Collections.singletonList(ro8Var.m76021b()));
            }
            String string5 = bundle.getString("watchfeed.share.share_format_id");
            if (string5 != null) {
                String string6 = bundle.getString("watchfeed.share.preview_entity_uri");
                boolean z = bundle.getBoolean("watchfeed.share.tool_config_enabled", false);
                zz71 zz71Var = new zz71(true);
                vsg1.m86352l(gn80.SHARE_FORMAT_ENTITY, new String[0]);
                shv shvVar = new shv(objArr == true ? 1 : 0, 63);
                bk01 bk01Var = bk01.f27801a;
                Set set2 = dd41.f47702f;
                xr01 xr01Var = new xr01(r46.m74726U(string5));
                String str2 = string6 != null ? string6 : null;
                if (z) {
                    zz71Var = new zz71(true);
                }
                return m87875b(eo01Var, Collections.singletonList(new sr01(new rr01(lu01Var, xr01Var), new nk01(new um01(qpv0.f191387a.mo54112b(ewv.class)), new hwv(str2, zz71Var, 0, false, shvVar, null, null), bk01Var, true), new q111(z300.f278736b, gbu.f78413a, true, null))));
            }
        }
        return null;
    }

    @Override // p204p.ach1
    public boolean zzb(Class cls) {
        return false;
    }

    @Override // p204p.ach1
    public jch1 zzc(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
