package p204p;

import android.util.Log;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.MessageTemplate;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class dve0 {

    /* JADX INFO: renamed from: a */
    public CarText f53440a;

    /* JADX INFO: renamed from: b */
    public final CarText f53441b;

    /* JADX INFO: renamed from: c */
    public CarText f53442c;

    /* JADX INFO: renamed from: d */
    public CarIcon f53443d;

    /* JADX INFO: renamed from: e */
    public Action f53444e;

    /* JADX INFO: renamed from: f */
    public ActionStrip f53445f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f53446g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public Header f53447h;

    public dve0(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        this.f53441b = CarText.create(charSequence);
    }

    /* JADX INFO: renamed from: a */
    public final MessageTemplate m37096a() {
        if (this.f53441b.isEmpty()) {
            throw new IllegalStateException("Message cannot be empty");
        }
        String str = "" + Log.getStackTraceString(null);
        if (!str.isEmpty()) {
            this.f53442c = CarText.create(str);
        }
        return new MessageTemplate(this);
    }
}
