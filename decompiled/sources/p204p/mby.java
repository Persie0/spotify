package p204p;

import com.spotify.familygatedcontent.p063v1.GetFeatureRequestDialogRequest;
import com.spotify.familygatedcontent.p063v1.RequestFeatureRequest;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: classes9.dex */
public final class mby {

    /* JADX INFO: renamed from: a */
    public final nby f141990a;

    public mby(nby nbyVar) {
        this.f141990a = nbyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m61429a(String str, String str2, ibk ibkVar) {
        jby jbyVar;
        if (ibkVar instanceof jby) {
            jbyVar = (jby) ibkVar;
            int i = jbyVar.f110920c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbyVar.f110920c = i - Integer.MIN_VALUE;
            } else {
                jbyVar = new jby(this, ibkVar);
            }
        } else {
            jbyVar = new jby(this, ibkVar);
        }
        Object obj = jbyVar.f110918a;
        int i2 = jbyVar.f110920c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        t810 t810VarM10591p = GetFeatureRequestDialogRequest.m10591p();
        t810VarM10591p.m80254q(str);
        t810VarM10591p.m80253m(str2);
        SingleSource map = this.f141990a.m64103b((GetFeatureRequestDialogRequest) t810VarM10591p.build()).map(new b1h1(str, 8));
        jbyVar.f110920c = 1;
        Object objM96567o = zn91.m96567o(map, jbyVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m61430b(String str, String str2, ibk ibkVar) {
        kby kbyVar;
        if (ibkVar instanceof kby) {
            kbyVar = (kby) ibkVar;
            int i = kbyVar.f121304c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kbyVar.f121304c = i - Integer.MIN_VALUE;
            } else {
                kbyVar = new kby(this, ibkVar);
            }
        } else {
            kbyVar = new kby(this, ibkVar);
        }
        Object obj = kbyVar.f121302a;
        int i2 = kbyVar.f121304c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        zuw0 zuw0VarM10599p = RequestFeatureRequest.m10599p();
        zuw0VarM10599p.m97083q(str);
        if (str2 != null) {
            zuw0VarM10599p.m97082m(str2);
        }
        RequestFeatureRequest requestFeatureRequest = (RequestFeatureRequest) zuw0VarM10599p.build();
        wj50.m88279p(requestFeatureRequest);
        SingleSource map = this.f141990a.m64102a(requestFeatureRequest).map(lby.f131767b);
        kbyVar.f121304c = 1;
        Object objM96567o = zn91.m96567o(map, kbyVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }
}
