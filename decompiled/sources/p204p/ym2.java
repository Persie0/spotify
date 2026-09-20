package p204p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ym2 {

    /* JADX INFO: renamed from: a */
    public final Flowable f274137a;

    public ym2(Flowable flowable, xre xreVar) {
        this.f274137a = flowable;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m94180a(ibk ibkVar) {
        xm2 xm2Var;
        long j;
        TimeZone timeZone;
        PlayerState playerState;
        String str;
        String strContextUri;
        if (ibkVar instanceof xm2) {
            xm2Var = (xm2) ibkVar;
            int i = xm2Var.f263276e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xm2Var.f263276e = i - Integer.MIN_VALUE;
            } else {
                xm2Var = new xm2(this, ibkVar);
            }
        } else {
            xm2Var = new xm2(this, ibkVar);
        }
        Object obj = xm2Var.f263274c;
        int i2 = xm2Var.f263276e;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                TimeZone timeZone2 = TimeZone.getDefault();
                try {
                    Flowable flowable = this.f274137a;
                    xm2Var.f263273b = timeZone2;
                    xm2Var.f263272a = jCurrentTimeMillis;
                    xm2Var.f263276e = 1;
                    Object objM43499j = g3h1.m43499j(flowable, xm2Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM43499j == yukVar) {
                        return yukVar;
                    }
                    j = jCurrentTimeMillis;
                    timeZone = timeZone2;
                    obj = objM43499j;
                } catch (Throwable th) {
                    th = th;
                    j = jCurrentTimeMillis;
                    timeZone = timeZone2;
                    na6.m63972t("Failed to read latest player state for AgentGatewayUserContext", th);
                    playerState = null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = xm2Var.f263272a;
                timeZone = xm2Var.f263273b;
                try {
                    bga.m29073P(obj);
                } catch (Throwable th2) {
                    th = th2;
                    na6.m63972t("Failed to read latest player state for AgentGatewayUserContext", th);
                    playerState = null;
                }
            }
            playerState = (PlayerState) obj;
            if (playerState != null) {
                String strM47210B = hdi.m47210B(playerState);
                if (wl51.m88460J0(strM47210B)) {
                    str = null;
                } else {
                    str = strM47210B;
                }
            } else {
                str = null;
            }
            String str2 = (playerState == null || (strContextUri = playerState.contextUri()) == null || wl51.m88460J0(strContextUri)) ? null : strContextUri;
            Boolean boolM74178H = playerState != null ? qyg1.m74178H(playerState.isPaused()) : null;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
            simpleDateFormat.setTimeZone(timeZone);
            return new wm2(str, str2, simpleDateFormat.format(new Date(j)), qyg1.m74180J((int) TimeUnit.MILLISECONDS.toMinutes(timeZone.getOffset(j))), boolM74178H, 32);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
