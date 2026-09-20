package p204p;

import android.net.Uri;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class rev implements po01 {

    /* JADX INFO: renamed from: a */
    public final bzo f198436a;

    /* JADX INFO: renamed from: b */
    public final boolean f198437b;

    /* JADX INFO: renamed from: c */
    public final v2q0 f198438c;

    /* JADX INFO: renamed from: d */
    public final kv71 f198439d;

    public rev(bzo bzoVar, boolean z, v2q0 v2q0Var, kv71 kv71Var) {
        this.f198436a = bzoVar;
        this.f198437b = z;
        this.f198438c = v2q0Var;
        this.f198439d = kv71Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // p204p.po01
    /* JADX INFO: renamed from: a */
    public final Object mo45982a(dwv dwvVar, fq01 fq01Var, List list, Uri uri, fbk fbkVar) {
        qev qevVar;
        List list2;
        Uri uri2;
        awv awvVar;
        LinkedHashMap linkedHashMap;
        fq01 fq01Var2;
        dwv dwvVar2;
        lu01 lu01Var;
        tu71 tu71Var;
        String strM57448a;
        icr0 icr0Var;
        icr0 icr0Var2;
        if (fbkVar instanceof qev) {
            qevVar = (qev) fbkVar;
            int i = qevVar.f188035X;
            if ((i & Integer.MIN_VALUE) != 0) {
                qevVar.f188035X = i - Integer.MIN_VALUE;
            } else {
                qevVar = new qev(this, (ibk) fbkVar);
            }
        } else {
            qevVar = new qev(this, (ibk) fbkVar);
        }
        qev qevVar2 = qevVar;
        Object obj = qevVar2.f188044i;
        int i2 = qevVar2.f188035X;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            lu01 lu01Var2 = dwvVar.mo27345c().f213201a.f201918a;
            awv awvVar2 = dwvVar instanceof awv ? (awv) dwvVar : null;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(lu01Var2.f136948c);
            tu71 tu71Var2 = awvVar2 != null ? awvVar2.f20715i : null;
            String str = lu01Var2.f136946a;
            boolean z = ((hwv) dwvVar.mo27345c().m78984g()).f96059d;
            qevVar2.f188036a = dwvVar;
            qevVar2.f188037b = fq01Var;
            list2 = list;
            qevVar2.f188038c = list2;
            uri2 = uri;
            qevVar2.f188039d = uri2;
            qevVar2.f188040e = lu01Var2;
            qevVar2.f188041f = awvVar2;
            qevVar2.f188042g = linkedHashMap2;
            qevVar2.f188043h = tu71Var2;
            qevVar2.f188035X = 1;
            if (this.f198438c.m84524a(linkedHashMap2, str, tu71Var2, z, qevVar2) != yukVar) {
                awvVar = awvVar2;
                linkedHashMap = linkedHashMap2;
                fq01Var2 = fq01Var;
                dwvVar2 = dwvVar;
                lu01Var = lu01Var2;
                tu71Var = tu71Var2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        tu71Var = qevVar2.f188043h;
        linkedHashMap = qevVar2.f188042g;
        awvVar = qevVar2.f188041f;
        lu01Var = qevVar2.f188040e;
        Uri uri3 = qevVar2.f188039d;
        List list3 = qevVar2.f188038c;
        fq01Var2 = qevVar2.f188037b;
        dwvVar2 = qevVar2.f188036a;
        bga.m29073P(obj);
        uri2 = uri3;
        list2 = list3;
        if (linkedHashMap.containsKey("t")) {
            strM57448a = this.f198439d.m57448a(String.valueOf(tu71Var != null ? new Long(tu71Var.f223785a) : null));
        } else {
            strM57448a = null;
        }
        lu01 lu01VarM59923c = lu01.m59923c(lu01Var, null, opo.m67547D(linkedHashMap), strM57448a, Error.TOO_YOUNG_FIELD_NUMBER);
        if (awvVar == null || (icr0Var2 = awvVar.f20712f) == null) {
            icr0Var = null;
        } else {
            fts ftsVar = new fts(dwvVar2, 23);
            if (fq01Var2 == zp01.f284897d && !this.f198437b && (icr0Var2 instanceof hcr0)) {
                icr0Var2 = (icr0) ftsVar.invoke();
            }
            icr0Var = icr0Var2;
        }
        x2r x2rVarM31048c = this.f198436a.m31048c(fq01Var2, list2, new f2r(3));
        gcr0 gcr0VarM27347j = awvVar != null ? awvVar.m27347j() : null;
        qevVar2.f188036a = null;
        qevVar2.f188037b = null;
        qevVar2.f188038c = null;
        qevVar2.f188039d = null;
        qevVar2.f188040e = null;
        qevVar2.f188041f = null;
        qevVar2.f188042g = null;
        qevVar2.f188043h = null;
        qevVar2.f188035X = 2;
        Object objMo34037c = x2rVarM31048c.mo34037c(lu01VarM59923c, icr0Var, gcr0VarM27347j, uri2, qevVar2);
        return objMo34037c == yukVar ? yukVar : objMo34037c;
    }
}
