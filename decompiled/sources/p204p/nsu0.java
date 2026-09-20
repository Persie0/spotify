package p204p;

import com.spotify.corex.reading.proto.ReadSpan;
import com.spotify.corex.reading.proto.Section;
import com.spotify.corex.reading.proto.TextCue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class nsu0 {

    /* JADX INFO: renamed from: e */
    public static final Set f157896e = bk5.m29624m1(new String[]{"spotify.com", "spotify.net"});

    /* JADX INFO: renamed from: a */
    public final bc7 f157897a;

    /* JADX INFO: renamed from: b */
    public final ie41 f157898b;

    /* JADX INFO: renamed from: c */
    public final luk f157899c;

    /* JADX INFO: renamed from: d */
    public final luk f157900d;

    public nsu0(bc7 bc7Var, ie41 ie41Var, luk lukVar, luk lukVar2) {
        this.f157897a = bc7Var;
        this.f157898b = ie41Var;
        this.f157899c = lukVar;
        this.f157900d = lukVar2;
    }

    /* JADX INFO: renamed from: d */
    public static aru0 m65587d(ReadSpan readSpan) {
        i4a jocVar;
        String uri = readSpan.getUri();
        String strM8138r = readSpan.m8138r();
        ae50<Section> ae50VarM8136p = readSpan.m8136p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM8136p, 10));
        for (Section section : ae50VarM8136p) {
            long jM8142p = section.m8142p();
            int iM8140n = section.m8140n();
            int i = iM8140n == 0 ? -1 : jsu0.f115560a[edb.m38547C(iM8140n)];
            if (i != 1) {
                jocVar = msm0.f146831a;
                if (i != 2 && i == 3) {
                    String strM8150p = section.m8143q().m8147o().m8150p();
                    if (strM8150p == null) {
                        strM8150p = "";
                    }
                    ae50<TextCue> ae50VarM8149n = section.m8143q().m8147o().m8149n();
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM8149n, 10));
                    for (TextCue textCue : ae50VarM8149n) {
                        arrayList2.add(new g571(textCue.m8145o(), textCue.m8144n()));
                    }
                    jocVar = new le71(strM8150p, arrayList2);
                }
            } else {
                jocVar = new joc(section.m8141o().getTitle());
            }
            arrayList.add(new b6z0(jM8142p, jocVar));
        }
        return new aru0(uri, strM8138r, arrayList, new n3s0(readSpan.m8135o().m8132p(), Integer.valueOf(readSpan.m8135o().m8131o())), new op71(readSpan.m8139s().m8155r(), readSpan.m8139s().m8153p(), readSpan.m8139s().m8152o(), readSpan.m8139s().m8154q()), new hpm0(readSpan.m8134n().m8128o(), readSpan.m8134n().m8129p()), readSpan.getName(), readSpan.m8137q());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m65588a(String str, ibk ibkVar) throws IOException {
        ksu0 ksu0Var;
        if (ibkVar instanceof ksu0) {
            ksu0Var = (ksu0) ibkVar;
            int i = ksu0Var.f126021c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ksu0Var.f126021c = i - Integer.MIN_VALUE;
            } else {
                ksu0Var = new ksu0(this, ibkVar);
            }
        } else {
            ksu0Var = new ksu0(this, ibkVar);
        }
        Object objM28687b = ksu0Var.f126019a;
        int i2 = ksu0Var.f126021c;
        if (i2 == 0) {
            bga.m29073P(objM28687b);
            Set set = dd41.f47702f;
            String strM35712j = r46.m74726U(str).m35712j();
            if (strM35712j == null) {
                throw new IllegalArgumentException(edb.m38564m("Invalid audiobook URI: ", str));
            }
            ksu0Var.f126021c = 1;
            objM28687b = this.f157897a.m28687b(strM35712j, null, ksu0Var);
            yuk yukVar = yuk.f276404a;
            if (objM28687b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM28687b);
        }
        ReadSpan readSpan = (ReadSpan) ((o2x0) objM28687b).f161172b;
        if (readSpan != null) {
            return m65587d(readSpan);
        }
        throw new IOException("Empty response body");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m65589b(String str, String str2, ibk ibkVar) throws IOException {
        lsu0 lsu0Var;
        if (ibkVar instanceof lsu0) {
            lsu0Var = (lsu0) ibkVar;
            int i = lsu0Var.f136615c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lsu0Var.f136615c = i - Integer.MIN_VALUE;
            } else {
                lsu0Var = new lsu0(this, ibkVar);
            }
        } else {
            lsu0Var = new lsu0(this, ibkVar);
        }
        Object objM28686a = lsu0Var.f136613a;
        int i2 = lsu0Var.f136615c;
        if (i2 == 0) {
            bga.m29073P(objM28686a);
            Set set = dd41.f47702f;
            String strM35712j = r46.m74726U(str).m35712j();
            if (strM35712j == null) {
                throw new IllegalArgumentException(edb.m38564m("Invalid audiobook URI: ", str));
            }
            String strM35712j2 = r46.m74726U(str2).m35712j();
            if (strM35712j2 == null) {
                throw new IllegalArgumentException(edb.m38564m("Invalid chapter URI: ", str2));
            }
            lsu0Var.f136615c = 1;
            objM28686a = this.f157897a.m28686a(strM35712j, strM35712j2, lsu0Var);
            yuk yukVar = yuk.f276404a;
            if (objM28686a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM28686a);
        }
        ReadSpan readSpan = (ReadSpan) ((o2x0) objM28686a).f161172b;
        if (readSpan != null) {
            return m65587d(readSpan);
        }
        throw new IOException("Empty response body");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m65590c(String str, ibk ibkVar) throws Throwable {
        msu0 msu0Var;
        String str2;
        if (ibkVar instanceof msu0) {
            msu0Var = (msu0) ibkVar;
            int i = msu0Var.f146863c;
            if ((i & Integer.MIN_VALUE) != 0) {
                msu0Var.f146863c = i - Integer.MIN_VALUE;
            } else {
                msu0Var = new msu0(this, ibkVar);
            }
        } else {
            msu0Var = new msu0(this, ibkVar);
        }
        Object objM89557A = msu0Var.f146861a;
        int i2 = msu0Var.f146863c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            rth rthVar = new rth();
            fbk fbkVar = null;
            rthVar.m76391l(null, str);
            ph30 ph30VarM76382c = rthVar.m76382c();
            String str3 = ph30VarM76382c.f177459d;
            if (wj50.m88271j(ph30VarM76382c.f177456a, pka1.f178421b)) {
                Set set = f157896e;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    do {
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            if (wj50.m88271j(str3, str2)) {
                                break;
                            }
                        }
                    } while (!bm51.m29796g0(str3, "." + str2, false));
                    ztw0 ztw0Var = new ztw0();
                    ztw0Var.m96949b();
                    ztw0Var.f286275a = ph30VarM76382c;
                    s6r0 s6r0Var = new s6r0(this, new auw0(ztw0Var), fbkVar, 26);
                    msu0Var.f146863c = 1;
                    objM89557A = x0h1.m89557A(this.f157899c, s6r0Var, msu0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM89557A == yukVar) {
                        return yukVar;
                    }
                }
            }
            throw new IllegalArgumentException(edb.m38564m("Refusing to fetch page from untrusted host: ", str3).toString());
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM89557A);
        ReadSpan readSpan = (ReadSpan) objM89557A;
        wj50.m88279p(readSpan);
        return m65587d(readSpan);
    }
}
