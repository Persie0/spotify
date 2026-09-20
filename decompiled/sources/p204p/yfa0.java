package p204p;

import com.spotify.personalizedepisodes.contentservice.p124v1.GetUserLocationResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.LocationSuggestion;
import com.spotify.personalizedepisodes.contentservice.p124v1.SuggestLocationsResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class yfa0 {

    /* JADX INFO: renamed from: a */
    public final hma0 f272191a;

    public yfa0(hma0 hma0Var) {
        this.f272191a = hma0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m93550a(ibk ibkVar) {
        wfa0 wfa0Var;
        Object c6x0Var;
        if (ibkVar instanceof wfa0) {
            wfa0Var = (wfa0) ibkVar;
            int i = wfa0Var.f250775c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfa0Var.f250775c = i - Integer.MIN_VALUE;
            } else {
                wfa0Var = new wfa0(this, ibkVar);
            }
        } else {
            wfa0Var = new wfa0(this, ibkVar);
        }
        Object objM47938a = wfa0Var.f250773a;
        int i2 = wfa0Var.f250775c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM47938a);
                hma0 hma0Var = this.f272191a;
                wfa0Var.f250775c = 1;
                objM47938a = hma0Var.m47938a(wfa0Var);
                yuk yukVar = yuk.f276404a;
                if (objM47938a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM47938a);
            }
            o2x0 o2x0Var = (o2x0) objM47938a;
            if (!o2x0Var.f161171a.f149852O0) {
                throw new HttpException(o2x0Var);
            }
            Object obj = o2x0Var.f161172b;
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            GetUserLocationResponse getUserLocationResponse = (GetUserLocationResponse) obj;
            c6x0Var = new ata1(getUserLocationResponse.m17422o(), getUserLocationResponse.m17423p(), getUserLocationResponse.getDisplayName(), getUserLocationResponse.getName(), getUserLocationResponse.m17421n());
            Throwable thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
                return c6x0Var;
            }
            throw thM77348a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [p.c6x0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: b */
    public final Serializable m93551b(String str, ibk ibkVar) {
        xfa0 xfa0Var;
        ?? c6x0Var;
        if (ibkVar instanceof xfa0) {
            xfa0Var = (xfa0) ibkVar;
            int i = xfa0Var.f260885c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xfa0Var.f260885c = i - Integer.MIN_VALUE;
            } else {
                xfa0Var = new xfa0(this, ibkVar);
            }
        } else {
            xfa0Var = new xfa0(this, ibkVar);
        }
        Object objM47939b = xfa0Var.f260883a;
        int i2 = xfa0Var.f260885c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM47939b);
                hma0 hma0Var = this.f272191a;
                xfa0Var.f260885c = 1;
                objM47939b = hma0Var.m47939b(str, xfa0Var);
                yuk yukVar = yuk.f276404a;
                if (objM47939b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM47939b);
            }
            o2x0 o2x0Var = (o2x0) objM47939b;
            if (!o2x0Var.f161171a.f149852O0) {
                throw new HttpException(o2x0Var);
            }
            Object obj = o2x0Var.f161172b;
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ae50<LocationSuggestion> ae50VarM17522n = ((SuggestLocationsResponse) obj).m17522n();
            c6x0Var = new ArrayList(i6f.m49804T(ae50VarM17522n, 10));
            for (LocationSuggestion locationSuggestion : ae50VarM17522n) {
                c6x0Var.add(new ema0(locationSuggestion.getName(), locationSuggestion.m17429n(), locationSuggestion.m17430o()));
            }
            Throwable thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
                return c6x0Var;
            }
            throw thM77348a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
    }
}
