package p204p;

import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class g690 {

    /* JADX INFO: renamed from: a */
    public final boolean f76961a;

    /* JADX INFO: renamed from: b */
    public final ItemList f76962b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f76963c;

    /* JADX INFO: renamed from: d */
    public final CarText f76964d;

    /* JADX INFO: renamed from: e */
    public final Action f76965e;

    /* JADX INFO: renamed from: f */
    public final ActionStrip f76966f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f76967g;

    /* JADX INFO: renamed from: h */
    public final Header f76968h;

    public g690(ListTemplate listTemplate) {
        this.f76961a = listTemplate.isLoading();
        this.f76965e = listTemplate.getHeaderAction();
        this.f76964d = listTemplate.getTitle();
        this.f76962b = listTemplate.getSingleList();
        this.f76963c = new ArrayList(listTemplate.getSectionedLists());
        this.f76966f = listTemplate.getActionStrip();
        this.f76967g = new ArrayList(listTemplate.getActions());
        this.f76968h = listTemplate.getHeader();
    }
}
