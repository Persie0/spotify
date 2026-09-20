package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p204p.ank;
import p204p.bxg1;
import p204p.kr50;
import p204p.nsn0;
import p204p.pnk;
import p204p.rzb;
import p204p.wdg1;
import p204p.wj50;
import p204p.zy5;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class ConversationItem implements kr50 {
    private final List<Action> mActions;
    private final ank mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final nsn0 mSelf;
    private final CarText mTitle;

    public ConversationItem(pnk pnkVar) {
        String str = pnkVar.f179423a;
        Objects.requireNonNull(str);
        this.mId = str;
        CarText carText = pnkVar.f179424b;
        Objects.requireNonNull(carText);
        this.mTitle = carText;
        this.mSelf = validateSender(pnkVar.f179425c);
        this.mIcon = pnkVar.f179426d;
        this.mIsGroupConversation = pnkVar.f179427e;
        List<CarMessage> listM87845s = wdg1.m87845s(pnkVar.f179428f);
        Objects.requireNonNull(listM87845s);
        this.mMessages = listM87845s;
        wj50.m88281r("Message list cannot be empty.", !listM87845s.isEmpty());
        Iterator<CarMessage> it = listM87845s.iterator();
        while (it.hasNext()) {
            wj50.m88281r("Message list cannot contain null messages", it.next() != null);
        }
        ank ankVar = pnkVar.f179429g;
        Objects.requireNonNull(ankVar);
        this.mConversationCallbackDelegate = ankVar;
        this.mActions = wdg1.m87845s(pnkVar.f179430h);
        this.mIndexable = true;
    }

    public static nsn0 validateSender(nsn0 nsn0Var) {
        Objects.requireNonNull(nsn0Var);
        Objects.requireNonNull(nsn0Var.f157848a);
        Objects.requireNonNull(nsn0Var.f157851d);
        return nsn0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && bxg1.m30826c(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public ank getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    public nsn0 getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(bxg1.m30832i(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        nsn0 nsn0Var = new nsn0();
        nsn0Var.f157848a = "";
        nsn0Var.f157849b = null;
        nsn0Var.f157850c = null;
        nsn0Var.f157851d = null;
        nsn0Var.f157852e = false;
        nsn0Var.f157853f = false;
        this.mSelf = nsn0Var;
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new zy5(4));
        this.mActions = Collections.EMPTY_LIST;
        this.mIndexable = true;
    }
}
