package p204p;

import io.reactivex.rxjava3.functions.BiFunction;
import spotify.autodownload.esperanto.proto.ShowStateResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class ezo implements BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64422a;

    /* JADX INFO: renamed from: b */
    public final boolean f64423b;

    /* JADX INFO: renamed from: c */
    public final String f64424c;

    public /* synthetic */ ezo(String str, boolean z, int i) {
        this.f64422a = i;
        this.f64424c = str;
        this.f64423b = z;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        ShowStateResponse showStateResponse = (ShowStateResponse) obj2;
        String strM97429n = showStateResponse.m97429n();
        if (strM97429n == null || strM97429n.length() == 0) {
            if (showStateResponse.getEnabled()) {
                return new ut7(bool.booleanValue());
            }
            return this.f64423b ? vt7.f244565a : new tt7(bool.booleanValue());
        }
        na6.m63957e("Error fetching state for " + this.f64424c + ", error=" + showStateResponse.m97429n());
        return vt7.f244566b;
    }

    public String toString() {
        switch (this.f64422a) {
            case 3:
                String str = this.f64423b ? "Applink" : "Unclassified";
                String str2 = this.f64424c;
                if (str2 == null) {
                    return str;
                }
                return str + '(' + str2 + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ezo(boolean z, String str, int i) {
        this.f64422a = i;
        this.f64423b = z;
        this.f64424c = str;
    }
}
