package p204p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class a3j {

    /* JADX INFO: renamed from: a */
    public final o4j f11968a;

    public a3j(o4j o4jVar) {
        this.f11968a = o4jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m24630a(ibk ibkVar) {
        z2j z2jVar;
        String str;
        if (ibkVar instanceof z2j) {
            z2jVar = (z2j) ibkVar;
            int i = z2jVar.f278596c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z2jVar.f278596c = i - Integer.MIN_VALUE;
            } else {
                z2jVar = new z2j(this, ibkVar);
            }
        } else {
            z2jVar = new z2j(this, ibkVar);
        }
        Object objM66245a = z2jVar.f278594a;
        int i2 = z2jVar.f278596c;
        if (i2 == 0) {
            bga.m29073P(objM66245a);
            z2jVar.f278596c = 1;
            objM66245a = this.f11968a.m66245a("personal_podcasts", z2jVar);
            yuk yukVar = yuk.f276404a;
            if (objM66245a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM66245a);
        }
        o2x0 o2x0Var = (o2x0) objM66245a;
        if (!o2x0Var.f161171a.f149852O0) {
            throw new HttpException(o2x0Var);
        }
        Object obj = o2x0Var.f161172b;
        if (obj == null) {
            throw new IllegalArgumentException("Response body is null for successful get connector apps response");
        }
        List<a2j> list = ((k4j) obj).f119236a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (a2j a2jVar : list) {
            String str2 = a2jVar.f11681a;
            String str3 = a2jVar.f11682b;
            String str4 = a2jVar.f11683c;
            if (str4 == null) {
                str4 = "";
                str = str4;
            } else {
                str = "";
            }
            String str5 = a2jVar.f11684d;
            boolean z = a2jVar.f11685e;
            String str6 = a2jVar.f11686f;
            if (str6 != null) {
                str = str6;
            }
            arrayList.add(new x1j(str2, str3, str4, str5, str, a2jVar.f11687g, z, a2jVar.f11688h));
        }
        return arrayList;
    }
}
