package com.lx.sendmessage.emoji;

public interface IEmoticonSelectedListener {
	void onEmojiSelected(String key);

	void onStickerSelected(String categoryName, String stickerName);
}
