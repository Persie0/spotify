package p204p;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bdf1 implements amk0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ bdf1 f26093b = new bdf1(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ bdf1 f26094c = new bdf1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26095a;

    public /* synthetic */ bdf1(int i) {
        this.f26095a = i;
    }

    @Override // p204p.eeu
    /* JADX INFO: renamed from: a */
    public final void mo24360a(Object obj, Object obj2) {
        switch (this.f26095a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                bmk0 bmk0Var = (bmk0) obj2;
                bmk0Var.mo29864a(xdf1.f260479g, entry.getKey());
                bmk0Var.mo29864a(xdf1.f260480h, entry.getValue());
                return;
            case 1:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                bmk0 bmk0Var2 = (bmk0) obj2;
                bmk0Var2.mo29864a(erf1.f62119g, entry2.getKey());
                bmk0Var2.mo29864a(erf1.f62120h, entry2.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
