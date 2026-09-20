package p204p;

import android.text.TextUtils;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;

/* JADX INFO: renamed from: p.ry */
/* JADX INFO: loaded from: classes3.dex */
public final class C2355ry {

    /* JADX INFO: renamed from: a */
    public boolean f203768a;

    /* JADX INFO: renamed from: b */
    public CarText f203769b;

    /* JADX INFO: renamed from: c */
    public CarIcon f203770c;

    /* JADX INFO: renamed from: d */
    public p7l0 f203771d;

    /* JADX INFO: renamed from: e */
    public CarColor f203772e;

    /* JADX INFO: renamed from: f */
    public int f203773f;

    /* JADX INFO: renamed from: g */
    public int f203774g;

    public C2355ry(Action action) {
        this.f203768a = true;
        CarColor carColor = CarColor.DEFAULT;
        this.f203772e = carColor;
        this.f203773f = 1;
        this.f203774g = 0;
        Objects.requireNonNull(action);
        this.f203773f = action.getType();
        this.f203770c = action.getIcon();
        this.f203769b = action.getTitle();
        this.f203771d = action.getOnClickDelegate();
        CarColor backgroundColor = action.getBackgroundColor();
        this.f203772e = backgroundColor != null ? backgroundColor : carColor;
        this.f203774g = action.getFlags();
        this.f203768a = action.isEnabled();
    }

    /* JADX INFO: renamed from: a */
    public final Action m76687a() {
        CarText carText;
        CarText carText2;
        CarText carText3;
        int i = this.f203773f;
        if (!Action.isStandardActionType(i) && this.f203770c == null && ((carText3 = this.f203769b) == null || TextUtils.isEmpty(carText3.toString()))) {
            throw new IllegalStateException("An action must have either an icon or a title");
        }
        if (i == 65538 || i == 65539) {
            if (this.f203771d != null) {
                throw new IllegalStateException(s571.m77246e(i, "An on-click listener can't be set on an action of type "));
            }
            if (this.f203770c != null || ((carText = this.f203769b) != null && !TextUtils.isEmpty(carText.toString()))) {
                throw new IllegalStateException("An icon or title can't be set on the standard back or app-icon action");
            }
        }
        if (i == 65540 && this.f203771d != null) {
            throw new IllegalStateException("An on-click listener can't be set on the pan mode action");
        }
        if (i == 65541) {
            if (this.f203771d != null) {
                throw new IllegalStateException("An on-click listener can't be set on the compose action");
            }
            CarText carText4 = this.f203769b;
            if (carText4 != null && !TextUtils.isEmpty(carText4.toString())) {
                throw new IllegalStateException("A title can't be set on the standard compose action");
            }
        }
        if (i != 65542 || (this.f203770c == null && ((carText2 = this.f203769b) == null || TextUtils.isEmpty(carText2.toString())))) {
            return new Action(this);
        }
        throw new IllegalStateException("MEDIA_PLAYBACK actions cannot have icons or titles");
    }
}
