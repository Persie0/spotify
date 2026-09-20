package p204p;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pnk {

    /* JADX INFO: renamed from: a */
    public final String f179423a;

    /* JADX INFO: renamed from: b */
    public final CarText f179424b;

    /* JADX INFO: renamed from: c */
    public final nsn0 f179425c;

    /* JADX INFO: renamed from: d */
    public final CarIcon f179426d;

    /* JADX INFO: renamed from: e */
    public final boolean f179427e;

    /* JADX INFO: renamed from: f */
    public List f179428f;

    /* JADX INFO: renamed from: g */
    public final ank f179429g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f179430h;

    public pnk(ConversationItem conversationItem) {
        this.f179423a = conversationItem.getId();
        this.f179424b = conversationItem.getTitle();
        this.f179425c = conversationItem.getSelf();
        this.f179426d = conversationItem.getIcon();
        this.f179427e = conversationItem.isGroupConversation();
        this.f179429g = conversationItem.getConversationCallbackDelegate();
        this.f179428f = conversationItem.getMessages();
        this.f179430h = new ArrayList(conversationItem.getActions());
    }
}
