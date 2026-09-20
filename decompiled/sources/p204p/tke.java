package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes8.dex */
public final class tke extends hy8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tke(bue0 bue0Var, ske skeVar, Scheduler scheduler, Scheduler scheduler2, gza gzaVar, jal0 jal0Var, int i) {
        super(bue0Var, skeVar, scheduler, scheduler2, FormatType.BANNER, gzaVar, jal0Var, qv8.f192934a);
        switch (i) {
            case 1:
                super(bue0Var, skeVar, scheduler, scheduler2, FormatType.BOTTOMSHEET, gzaVar, jal0Var);
                break;
            case 2:
                super(bue0Var, skeVar, scheduler, scheduler2, FormatType.FULLSCREEN, gzaVar, jal0Var);
                break;
            case 3:
                super(bue0Var, skeVar, scheduler, scheduler2, FormatType.SNACKBAR, gzaVar, jal0Var);
                break;
            case 4:
                super(bue0Var, skeVar, scheduler, scheduler2, FormatType.TOOLTIP, gzaVar, jal0Var);
                break;
            case 5:
                super(bue0Var, skeVar, scheduler, scheduler2, FormatType.WEB_VIEW, gzaVar, jal0Var);
                break;
            default:
                break;
        }
    }
}
