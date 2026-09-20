package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.Objects;
import p204p.coe0;
import p204p.rzb;
import p204p.x8j0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class MessageInfo implements x8j0 {
    private final CarIcon mImage;
    private final CarText mText;
    private final CarText mTitle;

    public MessageInfo(coe0 coe0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage);
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public CarText getText() {
        return this.mText;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mImage);
    }

    public String toString() {
        return "MessageInfo";
    }

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }
}
