package p204p;

import com.spotify.address.endpoint.model.p012v1.proto.GetAddressFieldsRequest;
import com.spotify.address.endpoint.model.p012v1.proto.GetFormRequest;
import com.spotify.address.endpoint.model.p012v1.proto.SearchAddressesRequest;
import com.spotify.address.endpoint.model.p012v1.proto.SubmitFormRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class sph0 implements lw1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f212877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f212878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f212879c;

    public sph0(gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3) {
        this.f212877a = gh00Var;
        this.f212878b = gh00Var2;
        this.f212879c = gh00Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.lw1
    /* JADX INFO: renamed from: a */
    public final Object mo60087a(GetFormRequest getFormRequest, fbk fbkVar) throws Throwable {
        qph0 qph0Var;
        if (fbkVar instanceof qph0) {
            qph0Var = (qph0) fbkVar;
            int i = qph0Var.f191319c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qph0Var.f191319c = i - Integer.MIN_VALUE;
            } else {
                qph0Var = new qph0(this, fbkVar);
            }
        } else {
            qph0Var = new qph0(this, fbkVar);
        }
        Object obj = qph0Var.f191317a;
        int i2 = qph0Var.f191319c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        n5q n5qVar = xsr.f265651a;
        tlp tlpVar = tlp.f221498c;
        tpf0 tpf0Var = new tpf0(this.f212877a, getFormRequest, this.f212878b, null, 8);
        qph0Var.f191319c = 1;
        Object objM89557A = x0h1.m89557A(tlpVar, tpf0Var, qph0Var);
        yuk yukVar = yuk.f276404a;
        return objM89557A == yukVar ? yukVar : objM89557A;
    }

    @Override // p204p.lw1
    /* JADX INFO: renamed from: b */
    public final Object mo60088b(GetAddressFieldsRequest getAddressFieldsRequest, fbk fbkVar) {
        n5q n5qVar = xsr.f265651a;
        return x0h1.m89557A(tlp.f221498c, new xoa0(getAddressFieldsRequest, null, 26), fbkVar);
    }

    @Override // p204p.lw1
    /* JADX INFO: renamed from: c */
    public final Object mo60089c(SubmitFormRequest submitFormRequest, fbk fbkVar) {
        n5q n5qVar = xsr.f265651a;
        return x0h1.m89557A(tlp.f221498c, new rph0(this.f212879c, submitFormRequest, null, 0), fbkVar);
    }

    @Override // p204p.lw1
    /* JADX INFO: renamed from: d */
    public final Object mo60090d(SearchAddressesRequest searchAddressesRequest, fbk fbkVar) {
        n5q n5qVar = xsr.f265651a;
        return x0h1.m89557A(tlp.f221498c, new xoa0(searchAddressesRequest, null, 27), fbkVar);
    }
}
