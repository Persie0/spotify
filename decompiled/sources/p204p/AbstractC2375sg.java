package p204p;

import com.spotify.wrapped.p194v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.sg */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2375sg {
    /* JADX INFO: renamed from: a */
    public static final String m78017a(wrm0 wrm0Var) {
        List list;
        hsm0 hsm0Var = wrm0Var.f254391c;
        if (hsm0Var instanceof gsm0) {
            list = lau.f131415a;
        } else {
            if (!(hsm0Var instanceof fsm0)) {
                throw new NoWhenBranchMatchedException();
            }
            list = ((fsm0) hsm0Var).f72900a;
        }
        String strM29801l0 = wrm0Var.f254389a;
        int i = 1;
        while (true) {
            if (!wl51.m88496t0(strM29801l0, "$" + i, false) || list.size() < i) {
                break;
            }
            strM29801l0 = bm51.m29801l0(strM29801l0, s571.m77246e(i, "$"), ((jsm0) list.get(i - 1)).f115517a);
            i++;
        }
        return strM29801l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [p.lau] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: b */
    public static final String m78018b(fuz0 fuz0Var) {
        String strM23203u;
        ?? arrayList;
        Paragraph paragraph = (Paragraph) fuz0Var.f73607b.getValue();
        int iM23158v = paragraph.m23158v();
        int i = iM23158v == 0 ? -1 : AbstractC2213og.f164957a[edb.m38547C(iM23158v)];
        int i2 = 1;
        if (i != 1) {
            arrayList = lau.f131415a;
            if (i == 2) {
                strM23203u = paragraph.m23155s().m23192s().m23203u();
            } else if (i != 3) {
                strM23203u = paragraph.m23156t().m23203u();
                ae50 ae50VarM23157u = paragraph.m23157u();
                arrayList = new ArrayList(i6f.m49804T(ae50VarM23157u, 10));
                Iterator it = ae50VarM23157u.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Paragraph.TextStyle) it.next()).m23203u());
                }
            } else {
                strM23203u = paragraph.m23153q().m23174r().m23203u();
            }
        } else {
            strM23203u = paragraph.m23154r().m23184t().m23203u();
            ae50 ae50VarM23185u = paragraph.m23154r().m23185u();
            arrayList = new ArrayList(i6f.m49804T(ae50VarM23185u, 10));
            Iterator it2 = ae50VarM23185u.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Paragraph.TextStyle) it2.next()).m23203u());
            }
        }
        while (true) {
            if (!wl51.m88496t0(strM23203u, "$" + i2, false) || arrayList.size() < i2) {
                break;
            }
            strM23203u = bm51.m29801l0(strM23203u, s571.m77246e(i2, "$"), (String) arrayList.get(i2 - 1));
            i2++;
        }
        return strM23203u;
    }
}
