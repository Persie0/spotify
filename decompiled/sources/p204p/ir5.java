package p204p;

import com.spotify.player.model.PlayerError;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes4.dex */
public final class ir5 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BehaviorSubject f104920b;

    public /* synthetic */ ir5(BehaviorSubject behaviorSubject, int i) {
        this.f104919a = i;
        this.f104920b = behaviorSubject;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f104919a) {
            case 0:
                this.f104920b.onNext((PlayerError) obj);
                break;
            case 1:
                this.f104920b.onNext((sg5) obj);
                break;
            case 2:
                this.f104920b.onNext((Boolean) obj);
                break;
            case 3:
                this.f104920b.onNext((cwi) obj);
                break;
            case 4:
                this.f104920b.onNext((Boolean) obj);
                break;
            case 5:
                this.f104920b.onNext((Boolean) obj);
                break;
            case 6:
                this.f104920b.onNext((Boolean) obj);
                break;
            case 7:
                this.f104920b.onNext((uqi) obj);
                break;
            case 8:
                this.f104920b.onNext((Boolean) obj);
                break;
            case 9:
                this.f104920b.onNext((hlr0) obj);
                break;
            default:
                this.f104920b.onNext((eyl0) obj);
                break;
        }
    }
}
