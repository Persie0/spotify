package p204p;

import androidx.car.app.dialer.InCallTemplate;
import androidx.car.app.dialer.TelephoneKeypadTemplate;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aj61 {

    /* JADX INFO: renamed from: b */
    public static final aj61 f16179b;

    /* JADX INFO: renamed from: a */
    public final HashSet f16180a;

    static {
        new aj61(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class));
        new aj61(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class));
        f16179b = new aj61(Arrays.asList(ListTemplate.class, PaneTemplate.class, GridTemplate.class, MessageTemplate.class, SearchTemplate.class, NavigationTemplate.class, SectionedItemTemplate.class, InCallTemplate.class, TelephoneKeypadTemplate.class));
    }

    public aj61(List list) {
        this.f16180a = new HashSet(list);
    }
}
