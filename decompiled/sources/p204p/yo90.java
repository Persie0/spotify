package p204p;

import com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity;

/* JADX INFO: loaded from: classes8.dex */
public final class yo90 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LiveSharingRecordingDialogsHostActivity f274603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo90(LiveSharingRecordingDialogsHostActivity liveSharingRecordingDialogsHostActivity, int i) {
        super(0);
        this.f274602a = i;
        this.f274603b = liveSharingRecordingDialogsHostActivity;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f274602a) {
            case 0:
                this.f274603b.finish();
                break;
            default:
                this.f274603b.finish();
                break;
        }
        return w2a1.f247311a;
    }
}
