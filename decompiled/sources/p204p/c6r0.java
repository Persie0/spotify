package p204p;

import com.spotify.player.model.ContextTrack;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class c6r0 {

    /* JADX INFO: renamed from: a */
    public final qb7 f34602a;

    /* JADX INFO: renamed from: b */
    public final foo0 f34603b;

    /* JADX INFO: renamed from: c */
    public final dt01 f34604c;

    /* JADX INFO: renamed from: d */
    public final dsw0 f34605d;

    /* JADX INFO: renamed from: e */
    public final yby0 f34606e;

    /* JADX INFO: renamed from: f */
    public final twz0 f34607f;

    public c6r0(qb7 qb7Var, foo0 foo0Var, dt01 dt01Var, dsw0 dsw0Var, yby0 yby0Var, twz0 twz0Var) {
        this.f34602a = qb7Var;
        this.f34603b = foo0Var;
        this.f34604c = dt01Var;
        this.f34605d = dsw0Var;
        this.f34606e = yby0Var;
        this.f34607f = twz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m31588a(String str, String str2, voc1 voc1Var, boolean z, ibk ibkVar) {
        a6r0 a6r0Var;
        w3k w3kVar;
        ArrayList arrayList;
        if (ibkVar instanceof a6r0) {
            a6r0Var = (a6r0) ibkVar;
            int i = a6r0Var.f12848e;
            if ((i & Integer.MIN_VALUE) != 0) {
                a6r0Var.f12848e = i - Integer.MIN_VALUE;
            } else {
                a6r0Var = new a6r0(this, ibkVar);
            }
        } else {
            a6r0Var = new a6r0(this, ibkVar);
        }
        a6r0 a6r0Var2 = a6r0Var;
        Object obj = a6r0Var2.f12846c;
        int i2 = a6r0Var2.f12848e;
        if (i2 == 0) {
            bga.m29073P(obj);
            List list = this.f34602a.f187026b.f236246d;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((t140) it.next()).f216153a);
            }
            a6r0Var2.f12844a = arrayList2;
            w3k w3kVar2 = w3k.f247603b;
            a6r0Var2.f12845b = w3kVar2;
            a6r0Var2.f12848e = 1;
            Serializable serializableM31589b = m31589b(str, str2, voc1Var, z, a6r0Var2);
            Serializable serializable = yuk.f276404a;
            if (serializableM31589b == serializable) {
                return serializable;
            }
            obj = serializableM31589b;
            w3kVar = w3kVar2;
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w3kVar = a6r0Var2.f12845b;
            arrayList = a6r0Var2.f12844a;
            bga.m29073P(obj);
        }
        return new y5r0(arrayList, w3kVar, (List) obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m31589b(String str, String str2, voc1 voc1Var, boolean z, ibk ibkVar) {
        b6r0 b6r0Var;
        ro80 ro80VarM44508o;
        String str3;
        ro80 ro80Var;
        Object obj;
        String str4;
        ro80 ro80Var2;
        if (ibkVar instanceof b6r0) {
            b6r0Var = (b6r0) ibkVar;
            int i = b6r0Var.f24031t;
            if ((i & Integer.MIN_VALUE) != 0) {
                b6r0Var.f24031t = i - Integer.MIN_VALUE;
            } else {
                b6r0Var = new b6r0(this, ibkVar);
            }
        } else {
            b6r0Var = new b6r0(this, ibkVar);
        }
        Object obj2 = b6r0Var.f24029h;
        int i2 = b6r0Var.f24031t;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ro80VarM44508o = geg1.m44508o();
            b6r0Var.f24022a = str;
            b6r0Var.f24023b = str2;
            b6r0Var.f24024c = voc1Var;
            b6r0Var.f24025d = ro80VarM44508o;
            b6r0Var.f24026e = ro80VarM44508o;
            b6r0Var.f24027f = ro80VarM44508o;
            b6r0Var.f24028g = z;
            b6r0Var.f24031t = 1;
            Object objM81823h = this.f34607f.m81823h(str2, b6r0Var);
            yuk yukVar = yuk.f276404a;
            if (objM81823h == yukVar) {
                return yukVar;
            }
            str3 = str2;
            ro80Var = ro80VarM44508o;
            obj = objM81823h;
            str4 = str;
            ro80Var2 = ro80Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = b6r0Var.f24028g;
            ro80Var2 = b6r0Var.f24027f;
            ro80Var = b6r0Var.f24026e;
            ro80 ro80Var3 = b6r0Var.f24025d;
            voc1 voc1Var2 = b6r0Var.f24024c;
            str3 = b6r0Var.f24023b;
            str4 = b6r0Var.f24022a;
            bga.m29073P(obj2);
            ro80VarM44508o = ro80Var3;
            voc1Var = voc1Var2;
            obj = obj2;
        }
        ro80Var2.add(obj);
        if (z) {
            ContextTrack.Builder builder = ContextTrack.builder(str4);
            mec0 mec0Var = new mec0();
            mec0Var.put(ContextTrack.Metadata.KEY_CONTEXT_URI, str3);
            mec0Var.put(ContextTrack.Metadata.KEY_MEDIA_START_POSITION, "0");
            mec0Var.put("is_pre_release", "true");
            ro80Var.add(this.f34603b.m42311a(voc1Var, Collections.singletonList(builder.metadata(mec0Var.m61540b()).build())));
        }
        ro80Var.add(this.f34604c.m36792a(str3, null));
        ro80Var.add(this.f34605d.m36786c(str3, voc1Var, nau.f152117a));
        ro80Var.add(this.f34606e.m93323a(str3));
        return geg1.m44506m(ro80VarM44508o);
    }
}
